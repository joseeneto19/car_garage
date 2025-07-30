CREATE TABLE tb_cars (
    id BIGSERIAL PRIMARY KEY,
    make VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    manufacture_year INT NOT NULL,
    color VARCHAR(30) NOT NULL,
    license_plate VARCHAR(10) UNIQUE NOT NULL,
    status VARCHAR(20) DEFAULT 'AVAILABLE' NOT NULL
);
